import React from 'react'
import { Link } from 'react-router-dom';

function Header() {
  return (
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <Link class="navbar-brand" to="/">Home</Link>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <Link class="nav-link active" aria-current="" to="login">login</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to="register">Register</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to="add">Add</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to="show">Show</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link disabled" aria-disabled="true">Disabled</Link>
        </li>
      </ul>
    </div>
  </div>
</nav>
  )
}

export default Header;