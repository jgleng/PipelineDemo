pipeline {
    agent {label 'win_slave_1'}

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World again'
            }
        }
    }
}
