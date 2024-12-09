import React from 'react'
import Product from './Product';

const Home = () => {
  return (
    <div class="container text-center">
  <div class="row">
    <div class="col-xl-3">
      <Product name ="Shirt" Brand="U.S Polo" price="5000" img=""/>
    </div>
    <div class="col-xl-3">
      <Product name ="Pants" Brand="Levis" price="4500" img=""/>
    </div>
    <div class="col-xl-3">
      <Product name ="Shoes" Brand="Nike" price="9000" img=""/>
    </div>
    <div class="col-xl-3">
      <Product name ="Hat" Brand="CowBoy" price="2000" img=""/>
    </div>
  </div>
</div>

  )
}

export default Home;