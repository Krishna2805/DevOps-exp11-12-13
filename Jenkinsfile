pipeline {
    agent any

    tools {
        jdk 'JDK-17'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Krishna2805/DevOps-exp11-12-13.git'
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
