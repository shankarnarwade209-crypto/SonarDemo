pipeline {
    agent any

    tools {
        maven 'Maven-3.9.11'
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

    }
}
