pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://URL.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Deploy with Ansible') {
            steps {
                ansiblePlaybook credentialsId: 'ansible id', inventory: 'hosts', playbook: 'docker-playbook.yml'
            }
        }
    }
}
