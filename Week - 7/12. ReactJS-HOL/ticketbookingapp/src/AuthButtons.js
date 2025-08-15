import React from 'react';

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

function UserGreeting() {
  return <h1>Welcome back</h1>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

export { LoginButton, LogoutButton, GuestGreeting, UserGreeting, Greeting };