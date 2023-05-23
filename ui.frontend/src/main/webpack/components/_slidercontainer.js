const parent = document.querySelector(".cmp-slider-container");
if (parent) {
  (function () {
    "use strict";
    const sliderContainer = document.querySelector(".cmp-slider-container");
    const slideRight = document.querySelector(
      ".cmp-slider-container-right-slide"
    );
    const slideRightid = document.getElementById("slideRightid");
    const slideLeft = document.querySelector(
      ".cmp-slider-container-left-slide"
    );
    const upButton = document.querySelector(
      ".cmp-slider-container-action-buttons-up-button"
    );
    const downButton = document.querySelector(
      ".cmp-slider-container-action-buttons-down-button"
    );
    const slidesLength = slideRightid?.querySelectorAll(
      ".cmp-slider-container-div"
    ).length;

    let activeSlideIndex = 0;

    slideLeft.style.top = `-${(slidesLength - 1) * 100}%`;

    const changeSlide = (direction) => {
      const sliderHeight = sliderContainer.clientHeight;
      if (direction === "up") {
        activeSlideIndex++;
        if (activeSlideIndex > slidesLength - 1) activeSlideIndex = 0;
      } else if (direction === "down") {
        activeSlideIndex--;
        if (activeSlideIndex < 0) activeSlideIndex = slidesLength - 1;
      }
      slideRight.style.transform = `translateY(-${
        activeSlideIndex * sliderHeight
      }px)`;
      slideLeft.style.transform = `translateY(${
        activeSlideIndex * sliderHeight
      }px)`;
    };

    upButton.addEventListener("click", () => changeSlide("up"));
    downButton.addEventListener("click", () => changeSlide("down"));
  })();
}
