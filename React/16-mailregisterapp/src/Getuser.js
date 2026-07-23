import React, { Component } from "react";

class Getuser extends Component {
  constructor(props) {
    super(props);

    this.state = {
      title: "",
      firstname: "",
      image: ""
    };
  }

  componentDidMount() {
    fetch("https://api.randomuser.me/")
      .then((response) => response.json())
      .then((data) => {
        const user = data.results[0];

        this.setState({
          title: user.name.title,
          firstname: user.name.first,
          image: user.picture.large
        });
      });
  }

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "40px" }}>
        <h1>Fetch User Details</h1>

        <img
          src={this.state.image}
          alt="User"
          width="200"
        />

        <h2>Title : {this.state.title}</h2>

        <h2>First Name : {this.state.firstname}</h2>
      </div>
    );
  }
}

export default Getuser;