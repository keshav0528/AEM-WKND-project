import Swiper, { Navigation, Pagination } from "swiper";

(function () {
  "use strict";

  var selectors = {
    self: '[data-cmp-is="profiletask"]',
  };

  function ProfileTask(config) {
    function init(config) {
      config.element.removeAttribute("data-cmp-is");

      const parent = document.querySelector(".cmp-samplecorecarousel");
      if (parent) {
        const slider = document.querySelector(".swiper-wrapper");

        if (slider) {
          const swiper = new Swiper(".swiper", {
            modules: [Navigation, Pagination],

            loop: true,

            pagination: {
              el: ".swiper-pagination",

              type: "fraction",
            },

            navigation: {
              nextEl: ".cmp-samplecorecarousel__container--button-next",

              prevEl: ".cmp-samplecorecarousel__container--button-prev",
            },
          });
        }

        btn;
      }
    }

    if (config && config.element) {
      init(config);
    }
  }

  function onDocumentReady() {
    var elements = document.querySelectorAll(selectors.self);
    for (var i = 0; i < elements.length; i++) {
      new ProfileTask({ element: elements[i] });
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
                new ProfileTask({ element: element });
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
