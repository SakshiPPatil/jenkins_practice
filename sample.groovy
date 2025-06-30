pipeline {
    agent {
        label 'node1'
    }
    tools {
        maven 'apache-maven-3.9.10'
    }
    stages {
        stage('pull') {
            steps {
              git branch: 'main', url: 'https://github.com/SakshiPPatil/studentdata.git'
                echo "pulling successful"
            }
        }
        stage('building') {
            steps {
                sh 'mvn clean package'
                echo "building successful"
            }
        }
        stage('Test') {
            steps {
                echo "testing successful"
            }
        }
        stage('Deploy') {
            steps {
                echo "deploy successful"
            }
        }
    }
}