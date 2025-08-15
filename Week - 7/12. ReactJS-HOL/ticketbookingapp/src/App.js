
import React, { useState } from 'react';
import './App.css';
import { LoginButton, LogoutButton, Greeting } from './AuthButtons';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;

  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div className="App">
      <header className="App-header">
        <Greeting isLoggedIn={isLoggedIn} />

        {button}

        {isLoggedIn ? (
          <div>
            <p>You can now view flight details and book tickets!</p>
          </div>
        ) : (
          <div>
            <p>As a guest, you can only browse flight details. Please log in to book tickets.</p>
          </div>
        )}
      </header>
    </div>
  );
}

export default App;