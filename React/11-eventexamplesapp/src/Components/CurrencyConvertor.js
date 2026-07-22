import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();

    this.state = {
      amount: "",
      currency: "",
    };
  }

  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value,
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const amount = parseFloat(this.state.amount);
    const euro = amount * 80;

    alert("Converting to Euro Amount is " + euro);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <form onSubmit={this.handleSubmit}>
          <table>
            <tbody>
              <tr>
                <td>Amount:</td>
                <td>
                  <input
                    type="number"
                    name="amount"
                    value={this.state.amount}
                    onChange={this.handleChange}
                  />
                </td>
              </tr>

              <tr>
                <td>Currency:</td>
                <td>
                  <input
                    type="text"
                    name="currency"
                    value={this.state.currency}
                    onChange={this.handleChange}
                  />
                </td>
              </tr>

              <tr>
                <td></td>
                <td>
                  <button type="submit">Submit</button>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;