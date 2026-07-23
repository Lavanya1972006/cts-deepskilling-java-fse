import axios from "axios";

class GitClient {

    static getRepositories(userName) {
        return axios
            .get(`https://api.github.com/users/${userName}/repos`)
            .then(response => response.data);
    }

}

export default GitClient;