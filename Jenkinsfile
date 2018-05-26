pipeline{
    agent{
        docker{
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages{
        stage('Build'){
            steps{
                sh 'mvn -B -DskipTests clean package sonar:sonar -Dsonar.host.url=http://localhost:9000   -Dsonar.login=admin -Dsonar.password=admin'
            }
        }

        stage('Test'){
            steps{
                sh 'mvn test'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}