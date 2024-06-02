pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                build job: 'Compile Job'
            }
        }
        stage('Test') {
            steps {
                build job: 'Test Job'
            }
        }
        stage('Package') {
            steps {
                build job: 'Package Job'
            }
        }
    }
}

