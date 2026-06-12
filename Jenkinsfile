pipeline {

    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/tirole10/WiproFinal_CapstoneProject.git'
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }

        always {
            archiveArtifacts artifacts: 'Reports/**', allowEmptyArchive: true
            archiveArtifacts artifacts: 'test-output/**', allowEmptyArchive: true
        }
    }
}