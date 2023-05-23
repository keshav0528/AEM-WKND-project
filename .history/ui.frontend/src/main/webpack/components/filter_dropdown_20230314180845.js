
document.getElementById("FilterCategory").onchange = function() {getSelectedValue() };function getSelectedValue() {
    const selectValue = document.getElementById("list").value;
    const acceptedValues = ['camera', 'dvr'];
    const productCards = document.querySelectorAll('.product-card');
  
    productCards.forEach(card => {
      if(acceptedValues.includes(selectValue)) {
        if(card.classList.contains(selectValue)) {
          card.style.display = 'block';
        } else {
          card.style.display = 'none';
        }
      } else {
        card.style.display = 'block';
      }
    })
  }
  document.getElementById("FilterProductType").onchange = function() {getSelectedValue() };function getSelectedValue() {
    const selectValue = document.getElementById("list").value;
    const acceptedValues = ['camera', 'dvr'];
    const productCards = document.querySelectorAll('.product-card');
  
    productCards.forEach(card => {
      if(acceptedValues.includes(selectValue)) {
        if(card.classList.contains(selectValue)) {
          card.style.display = 'block';
        } else {
          card.style.display = 'none';
        }
      } else {
        card.style.display = 'block';
      }
    })
  }
  document.getElementById("FilterPrice").onchange = function() {getSelectedValue() };function getSelectedValue() {
    const selectValue = document.getElementById("FilterPrice").value;
    const acceptedValues = ['camera', 'dvr'];
    const productCards = document.querySelectorAll('.product-card');
  
    productCards.forEach(card => {
      if(acceptedValues.includes(selectValue)) {
        if(card.classList.contains(selectValue)) {
          card.style.display = 'block';
        } else {
          card.style.display = 'none';
        }
      } else {
        card.style.display = 'block';
      }
    })
  }
  document.getElementById("FilterGender").onchange = function() {getSelectedValue() };function getSelectedValue() {
    const selectValue = document.getElementById("FilterGender").value;
    const acceptedValues = ['camera', 'dvr'];
    const productCards = document.querySelectorAll('.product-card');
  
    productCards.forEach(card => {
      if(acceptedValues.includes(selectValue)) {
        if(card.classList.contains(selectValue)) {
          card.style.display = 'block';
        } else {
          card.style.display = 'none';
        }
      } else {
        card.style.display = 'block';
      }
    })
  }