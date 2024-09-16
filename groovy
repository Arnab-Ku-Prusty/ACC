pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // TODO: Add build step
                sh './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                // TODO: Add test step
                sh './gradlew test'
            }
        }
    }

    post {
        always {
            // Clean up or other steps that should always run
            cleanWs()
        }
        success {
            echo 'Build and tests were successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}