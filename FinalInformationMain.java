package com.org.dl.main;

import com.org.dl.applicant.info.ApplicantInfoRetrieverService;
import com.org.dl.applicant.info.IApplicantInfoRetrieverService;
import com.org.dl.bo.*;
import com.org.dl.components.applicant.inforetriever.converter.dao.AddressVerificationDao;
import com.org.dl.components.applicant.inforetriever.converter.dao.CriminalRecordDao;
import com.org.dl.components.applicant.inforetriever.converter.dao.TestResultsDbDao;
import com.org.dl.components.applicant.inforetriever.converter.service.addressverification.AddressVerificationRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.addressverification.converter.AddressVerificationConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.CriminalRecordRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.converter.CriminalRecordConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.criminalrecord.converter.CriminalRecordsConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.ITestResultsRetriever;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsConverter;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsRetriever;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.TestResultsRetrieverService;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.factory.ITestResultChainFactory;
import com.org.dl.components.applicant.inforetriever.converter.service.testresults.factory.TestResultChainFactory;
import com.org.dl.driversLicenseInfo.DriversLicense;
import com.org.dl.driversLicenseInfo.DriversLicenseBuilder;
import com.org.dl.returnFinalInformation.FinalDriversLicenseDTO;
import com.org.dl.returnFinalInformation.FinalInformationDTO;
import com.org.dl.decidingOutcomes.DecideCriminalOutcome;
import com.org.dl.decidingOutcomes.DecideDrivingOutcome;
import com.org.dl.decidingOutcomes.DecideVisionOutcome;
import com.org.dl.decidingOutcomes.DecideWrittenOutcome;
import com.org.dl.extractors.ExtractDrivingTestResults;
import com.org.dl.extractors.ExtractVisionTestResults;
import com.org.dl.extractors.ExtractWrittenTestResults;
import com.org.dl.decidingOutcomes.TestOutcome;
import com.org.dl.validation.ValidateCriminalRecord;

import java.util.Date;

public class FinalInformationMain {
        public static void main(String[] args) {
//            // Instantiate decision classes
//            DecideCriminalOutcome decideCriminal = new DecideCriminalOutcome();
//            DecideDrivingOutcome decideDriving = new DecideDrivingOutcome();
//            DecideVisionOutcome decideVision = new DecideVisionOutcome();
//            DecideWrittenOutcome decideWritten = new DecideWrittenOutcome();
//
//            // Perform decisions to get outcomes
//            ValidateCriminalRecord validateCriminalRecord = new ValidateCriminalRecord();
//            CriminalRecord record = new CriminalRecord(CrimeType.ARSON, "Description", new Date(), true);
//            TestResults testResults = new TestResults();
//            Inspector inspector = new Inspector("Ved", "Credit of Honor", 25);
//            Result result = Result.PASS;
//            Date dateTaken = new Date(2023, 11, 18);
//            float timeTaken = 30000;
//            Address address = new Address(92033, "Rodeo Drive", "Drive", "California");
//            OfficeInformation officeInformation = new OfficeInformation(address, "Arleta", 3233);
//            DrivingTestResult drivingTestResult = new DrivingTestResult(result, inspector, dateTaken, timeTaken, officeInformation);
//            testResults.add(drivingTestResult);
//            int maxScore = 100;
//            int minScore = 75;
//            int actualScore = 77;
//            Date writtenDateTaken = new Date(2022);
//            float writtenTimeTaken = 50000;
//            WrittenTestResult writtenTestResult = new WrittenTestResult(maxScore, minScore, actualScore, writtenDateTaken,  writtenTimeTaken);
//            testResults.add(writtenTestResult);
//
//            Result visionResult = Result.PASS;
//            Date visionDateTaken = new Date(2023, 11, 23);
//            float visionTimeTaken = 54000;
//            boolean correctiveLensesRequired = false;
//            VisionTestResult visionTestResult = new VisionTestResult(visionResult, visionDateTaken, visionTimeTaken, correctiveLensesRequired);
//            testResults.add(visionTestResult);
//            TestOutcome criminalOutcome = decideCriminal.criminalRecordClear(validateCriminalRecord, record);
//            TestOutcome drivingOutcome = decideDriving.decide(new ExtractDrivingTestResults(), testResults);
//            TestOutcome visionOutcome = decideVision.decide(new ExtractVisionTestResults(), testResults);
//            //decidingOutcomes.TestOutcome writtenOutcome = decidingOutcomes.TestOutcome.PASS;
//            //fix this because written outcome output is not always working, i think it has to do with the date
//            TestOutcome writtenOutcome = decideWritten.decide(new ExtractWrittenTestResults(), testResults);
            AddressVerificationDao adao = new AddressVerificationDao();
            AddressVerificationConverter aconverter = new AddressVerificationConverter();
            AddressVerificationRetrieverService aservice = new AddressVerificationRetrieverService(adao, aconverter);
            CriminalRecordDao cdao = new CriminalRecordDao();
            CriminalRecordConverter crconverter = new CriminalRecordConverter();
            CriminalRecordsConverter crsconverter = new CriminalRecordsConverter(crconverter);
            CriminalRecordRetrieverService cservice= new CriminalRecordRetrieverService(cdao, crsconverter);
            TestResultsDbDao tdao = new TestResultsDbDao();
            ITestResultChainFactory factory = new TestResultChainFactory();
            ITestResultsRetriever testResultsRetriever = new TestResultsRetriever(factory);
            TestResultsConverter tconverter = new TestResultsConverter(testResultsRetriever);
            TestResultsRetrieverService tservice = new TestResultsRetrieverService(tdao, tconverter);
            Applicant applicant = new Applicant(5591, "Ved", "Vyas", 25353, false, "none", "5'5");
            IApplicantInfoRetrieverService service = new ApplicantInfoRetrieverService(aservice, cservice, tservice);
            ApplicantActualInformation applicantActualInformation = service.retrieve(applicant);
            VisionTestResult visionTestResult = applicantActualInformation.testResults().getVisionTests().get(0);
            WrittenTestResult writtenTestResult = applicantActualInformation.testResults().getWrittenTests().get(0);
            DrivingTestResult drivingTestResult = applicantActualInformation.testResults().getDrivingTests().get(0);
            CriminalRecord record = applicantActualInformation.record();
            TestOutcome visionOutcome;
            TestOutcome drivingOutcome;
            TestOutcome writtenOutcome;
            TestOutcome criminalOutcome;
            DecideVisionOutcome decideVisionOutcome = new DecideVisionOutcome();
            visionOutcome = decideVisionOutcome.decide(visionTestResult);

            DecideDrivingOutcome decideDrivingOutcome = new DecideDrivingOutcome();
            drivingOutcome = decideDrivingOutcome.decide(drivingTestResult);

            DecideCriminalOutcome decideCriminalOutcome = new DecideCriminalOutcome();
            ValidateCriminalRecord validateCriminalRecord = new ValidateCriminalRecord();
            criminalOutcome = decideCriminalOutcome.criminalRecordClear(validateCriminalRecord, record);
//            System.out.println(applicantActualInformation);
//                if(visionTestResult.getResult() == Result.PASS) {
//                    visionOutcome = TestOutcome.PASS;
//                }
//                else if(visionTestResult.getResult() == Result.FAIL) {
//                    visionOutcome = TestOutcome.FAIL;
//                }
//                else {
//                    visionOutcome = TestOutcome.UNAVAILABLE;
//                }
//            if(drivingTestResult.getResult() == Result.PASS) {
//                drivingOutcome = TestOutcome.PASS;
//            }
//            else if(drivingTestResult.getResult() == Result.FAIL) {
//                drivingOutcome = TestOutcome.FAIL;
//            }
//            else {
//                drivingOutcome = TestOutcome.UNAVAILABLE;
//            }

            DecideWrittenOutcome decideWrittenOutcome = new DecideWrittenOutcome();
            writtenOutcome = decideWrittenOutcome.decide(writtenTestResult);

//            if(record.revoked()) {
//                criminalOutcome = TestOutcome.PASS;
//            }
//            else if(record.equals(null)) {
//                criminalOutcome = TestOutcome.UNAVAILABLE;
//            }
//            else {
//                criminalOutcome = TestOutcome.FAIL;
//            }
            // Create returnFinalInformation.FinalInformationDTO instance
            FinalInformationDTO finalInfo = new FinalInformationDTO(criminalOutcome, drivingOutcome, visionOutcome, writtenOutcome, null, null);

            //CreateFinalDriversLicesneDTO instance
            FinalDriversLicenseDTO finalDriversLicenseDTO = new FinalDriversLicenseDTO();
//
            DriversLicenseBuilder driversLicenseBuilder = new DriversLicenseBuilder(applicantActualInformation);
            DriversLicense driversLicense = finalDriversLicenseDTO.getLicense(driversLicenseBuilder, finalInfo);

            // Example usage:
            System.out.println("Criminal Outcome: " + finalInfo.getCriminalOutcome());
            System.out.println("Driving Outcome: " + finalInfo.getDrivingOutcome());
            System.out.println("Vision Outcome: " + finalInfo.getVisionOutcome());
            System.out.println("Written Outcome: " + finalInfo.getWrittenOutcome());

            System.out.println("Drivers Licsense:" + driversLicense);
        }
    }


