import React, { Component } from "react";
import GitClient from "./GitClient";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      repos: []
    };
  }

  componentDidMount() {
    GitClient.getRepositories("techiesyed")
      .then(data => {
        this.setState({
          repos: data
        });
      });
  }

  render() {
    return (
      <div>
        <h1>Git Repository List</h1>

        <ul>
          {this.state.repos.map(repo => (
            <li key={repo.id}>
              {repo.name}
            </li>
          ))}
        </ul>

      </div>
    );
  }
}

export default App;