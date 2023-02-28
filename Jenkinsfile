pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        sh './gradlew compileJava'
      }
    }

    stage('test') {
      steps {
        sh './gradlew clean test aggregate'
      }
    }

    stage('static') {
      steps {
        script{
            def scannerHome = tool 'sonarscanner';
            withSonarQubeEnv('sonar') {
              sh "${scannerHome}/bin/sonar-scanner"
            }
            def qualitygate = waitForQualityGate(abortPipeline: true)
            if (qualitygate.status != "OK") {
              error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
            }
        }
      }
    }

    stage('tomarReporte') {
      steps {
        archiveArtifacts(artifacts: 'target/site/serenity/**', allowEmptyArchive: true)
      }
    }

  }
}