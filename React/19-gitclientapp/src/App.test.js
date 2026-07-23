import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders Git Repository List", () => {
  render(<App />);
  const heading = screen.getByText(/Git Repository List/i);
  expect(heading).toBeInTheDocument();
});