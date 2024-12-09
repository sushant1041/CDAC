import React from 'react'
import Header from './Header'
import Footer from './Footer'
import Home from './Home'
import { Outlet } from 'react-router-dom'

function App() {
  return (
    <>
    <Header/>
    <Outlet/>
    <Footer/>
    </>      
    
  )
}

export default App;