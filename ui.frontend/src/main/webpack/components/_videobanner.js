
import Plyr from 'plyr';

const parent = document.querySelector(".cmp-video-banner");
if (parent) {
(function () {
  "use strict";

  var selectors = {
    self: '[data-cmp-is = "cmp-video-banner"]',
  };

  function Video(config) {
    function init(config) {
    
      config.element.removeAttribute("data-cmp-is");
      const video = config.element.querySelector('.cmp-video-banner-video')
      const player = new Plyr(video);
    }

    if (config && config.element) {
      init(config);
    }
  }

  function onDocumentReady() {
    var elements = document.querySelectorAll(selectors.self);
    for (var i = 0; i < elements.length; i++) {
      new Video({ element: elements[i] });
    }

    var MutationObserver =
      window.MutationObserver ||
      window.WebKitMutationObserver ||
      window.MozMutationObserver;
    var body = document.querySelector("body");
    var observer = new MutationObserver(function (mutations) {
      mutations.forEach(function (mutation) {
        // needed for IE
        var nodesArray = [].slice.call(mutation.addedNodes);
        if (nodesArray.length > 0) {
          nodesArray.forEach(function (addedNode) {
            if (addedNode.querySelectorAll) {
              var elementsArray = [].slice.call(
                addedNode.querySelectorAll(selectors.self)
              );
              elementsArray.forEach(function (element) {
                new Video({ element: element });
              });
            }
          });
        }
      });
    });

    observer.observe(body, {
      subtree: true,
      childList: true,
      characterData: true,
    });
  }

  if (document.readyState !== "loading") {
    onDocumentReady();
  } else {
    document.addEventListener("DOMContentLoaded", onDocumentReady);
  }
})();
}
