pipeline {
    agent {
        label 'node1'
    }
    environment {
        PATH = "/opt/apache-maven-3.9.10/bin:$PATH"
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