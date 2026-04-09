pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git '<repo-url>'
            }
        }

        stage('Build & Test') {
            steps {
                // Use 'bat' for Windows instead of 'sh'
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Use double backslashes for Windows paths
            junit '**\\target\\surefire-reports\\*.xml'
        }
    }
}