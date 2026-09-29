pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube') {
            steps {
                echo 'SonarQube analysis will run here'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Docker image will be built here'
            }
        }

        stage('Docker Push') {
            steps {
                echo 'Docker image will be pushed here'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Application deployment will happen here'
            }
        }
    }
}
