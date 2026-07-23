import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

    test("should return repository names for techiesyed", async () => {

        const repos = [
            { id: 1, name: "Repo1" },
            { id: 2, name: "Repo2" },
            { id: 3, name: "Repo3" }
        ];

        axios.get.mockResolvedValue({
            data: repos
        });

        const result = await GitClient.getRepositories("techiesyed");

        expect(axios.get).toHaveBeenCalledWith(
            "https://api.github.com/users/techiesyed/repos"
        );

        expect(result).toEqual(repos);

    });

});