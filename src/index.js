import React from "react";
import ReactDOM from "react-dom/client";
import App from "./components/App";
import "./style.css";
import {
    createBrowserRouter,
    RouterProvider,
  } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";
import Register from "./components/Register";
import Add from "./components/Add";
import Show from "./components/Show";
import NotFound from "./components/NotFound";

  const Proute = createBrowserRouter([
    {
        path:"/",
        element: <App/>,
        children:[
            {path:"/",element:<Home/>},
            {path:"login",element:<Login/>},
            {path:"register",element:<Register/>},
            {path:"add",element:<Add/>},
            {path:"show",element:<Show/>},   
            {path:"*",element:<NotFound/>}   
        ]
    }
  ])
  

// console.log(React);
// console.log(ReactDOM);

const ans = ReactDOM.createRoot(document.getElementById("root"));

ans.render(<RouterProvider router={Proute} />);

