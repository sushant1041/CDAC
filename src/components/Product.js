import React from 'react'

function Product(props) {
    console.log(props);
    function MyFun(){
        props.price=90000;
    }

  return (
    <div className='text-center'>
        <h2>{props.price}</h2>
        <p>{props.Brand}</p>
        <p>{props.name}</p>
        <p>
            <button onClick={MyFun}>Add to Cart</button>
        </p>
    </div>
  )
}

export default Product;