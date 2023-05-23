
const parent = document.querySelector(".cmp-ebook-modal");
if (parent) {
(function () {
        "use strict";
      
       
        var selectors = {
          self: '[data-cmp-is = "cmp-ebook-modal"]',
        };
      
        function Ebook(config) {
          function init(config) {
            console.log('hello')
           
            config.element.removeAttribute("data-cmp-is");
            const print = config.element.querySelector('.cmp-ebook-modal-bottom-media--printimg');
            print.addEventListener('click',function(e){
              window.print();
            })
          }
      
          if (config && config.element) {
            init(config);
          }
        }
      
  
        function onDocumentReady() {
          var elements = document.querySelectorAll(selectors.self);
          for (var i = 0; i < elements.length; i++) {
            new Ebook({ element: elements[i] });
          }
      
          var MutationObserver =
            window.MutationObserver ||
            window.WebKitMutationObserver ||
            window.MozMutationObserver;
          var body = document.querySelector("body");
          var observer = new MutationObserver(function (mutations) {
            mutations.forEach(function (mutation) {
           
              var nodesArray = [].slice.call(mutation.addedNodes);
              if (nodesArray.length > 0) {
                nodesArray.forEach(function (addedNode) {
                  if (addedNode.querySelectorAll) {
                    var elementsArray = [].slice.call(
                      addedNode.querySelectorAll(selectors.self)
                    );
                    elementsArray.forEach(function (element) {
                      new Ebook({ element: element });
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