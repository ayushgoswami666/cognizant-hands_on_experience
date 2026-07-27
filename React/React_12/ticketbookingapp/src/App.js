import React, { Component } from "react";
import Guest from "./Guest";
import User from "./User";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    let page;

    if (this.state.isLoggedIn) {

      page = <User />;

    } else {

      page = <Guest />;

    }

    return (

      <div style={{ textAlign: "center", marginTop: "30px" }}>

        <h1>Ticket Booking App</h1>

        {page}

        <br />

        {this.state.isLoggedIn ? (

          <button onClick={this.logout}>
            Logout
          </button>

        ) : (

          <button onClick={this.login}>
            Login
          </button>

        )}

      </div>

    );

  }
}

export default App;