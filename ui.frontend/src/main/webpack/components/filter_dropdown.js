const parent  = document.querySelector('.cmp-filter-dropdown-product-filter');
if(parent){

document.getElementById("FilterCategory").onchange = function () {
  getSelectedValueCategory();
};
function getSelectedValueCategory() {
  const selectValue = document.getElementById("FilterCategory").value;
  console.log(selectValue);
  const acceptedValues = ["Apparel", "FOOTWEAR", "Sandals"];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });

  const currentCard = document.querySelector(`#${selectValue}`);
  currentCard.style.display = "block";
}
document.getElementById("FilterProductType").onchange = function () {
  getSelectedValueProductType();
};
function getSelectedValueProductType() {
  const selectValue = document.getElementById("FilterProductType").value;
  const acceptedValues = ["Bag", "Cap", "Sandals", "SportsShoe", "dvr"];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });
}
document.getElementById("FilterPrice").onchange = function () {
  getSelectedValuePrice();
};
function getSelectedValuePrice() {
  const selectValue = document.getElementById("FilterPrice").value;
  const acceptedValues = [
    "Less Then 1000",
    "1000-3000",
    "3000-5000",
    "5000-10000",
    "dvr",
  ];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });
}
document.getElementById("FilterGender").onchange = function () {
  getSelectedValueGender();
};
function getSelectedValueGender() {
  const selectValue = document.getElementById("FilterGender").value;
  const acceptedValues = ["Male", "Female"];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });
}
document.getElementById("FilterColor").onchange = function () {
  getSelectedValueColor();
};
function getSelectedValueColor() {
  const selectValue = document.getElementById("FilterColor").value;
  const acceptedValues = ["Red", "Black", "Green", "Blue", "Grey"];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });
}

document.getElementById("FilterSize").onchange = function () {
  getSelectedValueSize();
};
function getSelectedValueSize() {
  const selectValue = document.getElementById("FilterSize").value;
  const acceptedValues = ["3", "4", "5", "6", "7", "8", "9", "10", "11"];
  const productCards = document.querySelectorAll(".cmp-product-grid-item");

  productCards.forEach((card) => {
    if (acceptedValues.includes(selectValue)) {
      if (card.classList.contains(selectValue)) {
        card.style.display = "block";
      } else {
        card.style.display = "none";
      }
    } else {
      card.style.display = "block";
    }
  });
}
}