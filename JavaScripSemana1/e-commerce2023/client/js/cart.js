const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");

const cartBtn = document.getElementById("cart-btn");


const displayCart = () => {
    modalContainer.innerHTML = "";
    modalContainer.style.display = "block";
    modalOverlay.style.display = "block"
    const modalHeader = document.createElement("div");

    const modalClose = document.createElement("div");
    modalClose.innerText = "✖️"
    modalClose.className = "modal-close";
    modalHeader.append(modalClose);

    modalClose.addEventListener("click", ()=>{
        modalContainer.style.display = "none";
        modalOverlay.style.display = "none";
    })

    const modalTitle = document.createElement("div");
    modalTitle.innerText = "Cart";
    modalTitle.className = "modal-tittle";
    modalHeader.append(modalTitle);

    modalContainer.append(modalHeader);
    //modal Body 
    cart.fotEach((product) => {
        const modalBody = document.createElement("div");
        modalBody.className = "modal-body"
        modalBody.innerHTML = '
        <div class="product">
            <img class="product-img" src"${product.img}" />
            <div class="product-info">
               <h4>${product.productName}</h4>
            <div>
        <div class="quantity">
                 <span class="quantity-btn-decrese">-</span>
                 <span class="quantity-input">${product.quanty}</span>
                 <span class="quantity-btn-decrese">+</span>
        </div>
        ';    
        modalContainer.append(modalBody);
     });

   //modal fotter

   const modalFooter = document.createElement("div");
   modalFooter.className = "modal-footer";
   modalFooter.innerHTML ='
     <div class="total-price">Total :)</div>
   ';
   modalContainer.append(modalFooter);
};

cartBtn.addEventListener("click", displayCart);
