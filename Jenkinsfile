pipeline {
    agent none
    stages {
        stage('Package') {
            agent {
                    docker {
                        image 'maven:3-alpine'
                        args '-v /root/.m2:/root/.m2 -v /root/.m2/settings.xml:/usr/share/maven/conf/settings.xml'
                    }
            }
            steps {
                echo 'Package..'
                sh 'mvn clean package install -Dmaven.test.skip=true'
                echo 'SonarQube Test..'
             // sh 'mvn sonar:sonar'
            }
            }}}