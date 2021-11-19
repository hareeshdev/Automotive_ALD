
pipeline {
    agent any

    stages {
        stage('Build Application') {
            steps {
                echo 'Build New Application in World'
            }
        }
    
   
        stage('Test Application') {
            steps {
                echo 'Test Applicatiuon in the World'
            }
        }
   
        stage('Deploy The Application') {
            steps {
                echo 'Deploy The Application in the World'
            }
        }
    }
    post{
        
        always {
            emailext body: 'Dummy body pipeline status need to got the email notification', subject: 'Pipeline status', to: 'hareesh.c021@gmail.com'
        }
    }
 }
