pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                step{
                 def listfile = load "${env.WORKSPACE}//jobList.txt"
            def finalList = listfile.readLines()
        finalList.each{line ->
        println 'list value is : ' + line }
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
