node {
     def listfile = load "${env.WORKSPACE}//jobList.txt"
     def finalList = listfile.readLines()
     finalList.each{line ->
     println 'list value is : ' + line }
       
    stages {
        stage('Build') {
            steps {
               echo 'test'
            }
        }
    }
}
