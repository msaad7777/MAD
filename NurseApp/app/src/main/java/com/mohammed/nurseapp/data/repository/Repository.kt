package com.mohammed.nurseapp.data.repository

import com.mohammed.nurseapp.data.dao.PatientDao
import com.mohammed.nurseapp.data.dao.TestDao
import com.mohammed.nurseapp.data.dao.NurseDao
import com.mohammed.nurseapp.data.entities.Patient
import com.mohammed.nurseapp.data.entities.Test
import com.mohammed.nurseapp.data.entities.Nurse

class Repository(
    private val patientDao: PatientDao,
    private val testDao: TestDao,
    private val nurseDao: NurseDao
) {
    suspend fun insertPatient(patient: Patient) = patientDao.insertPatient(patient)
    suspend fun getPatientById(patientId: Int) = patientDao.getPatientById(patientId)
    suspend fun updatePatient(patient: Patient) = patientDao.updatePatient(patient)

    suspend fun insertTest(test: Test) = testDao.insertTest(test)
    suspend fun getTestById(testId: Int) = testDao.getTestById(testId)
    suspend fun updateTest(test: Test) = testDao.updateTest(test)

    suspend fun insertNurse(nurse: Nurse) = nurseDao.insertNurse(nurse)
    suspend fun getNurse(nurseId: Int, password: String) = nurseDao.getNurse(nurseId, password)
}
