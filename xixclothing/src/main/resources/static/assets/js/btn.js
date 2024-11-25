const cartButtons = document.querySelectorAll('.add-to-cart-btn');
    
cartButtons.forEach(button => {
    button.addEventListener('click', cartClick);
});
    
function cartClick() {
let button = this;
button.classList.add('clicked');

setTimeout(() => {
        button.classList.remove('clicked');
    }, 4000);
}