pipeline {

    agent any

    tools {
        maven 'Maven3'
    }

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
                echo 'Configure SonarQube scan here'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Configure Docker build here'
            }
        }

        stage('Docker Push') {
            steps {
                echo 'Configure Docker push here'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Configure deployment here'
            }
        }
    }
}
