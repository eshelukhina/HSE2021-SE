# Gosuslugi.Medicine

<!-- Add buttons here -->

[![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/eshelukhina/HSE2021-SE?include_prereleases)](https://github.com/eshelukhina/HSE2021-SE/releases)
[![License](https://img.shields.io/github/license/eshelukhina/HSE2021-SE)](https://github.com/eshelukhina/HSE2021-SE/blob/main/LICENSE)
[![Build](https://github.com/eshelukhina/HSE2021-SE/actions/workflows/main_workflow.yml/badge.svg)](https://github.com/eshelukhina/HSE2021-SE/actions/workflows/main_workflow.yml)

<!-- Describe your project in brief -->

# Table of Contents
1. [Description](#Description)
2. [RoadMap](#RoadMap)
3. [Build and run](#BuildAndRun)
4. [Authors](#Authors)
5. [License](#License)

## Description
A service system for creating digital interaction between doctors and patients.

**Patients:**
* access to the results of medical examinations
* history of visits
* electronic appointment with a doctor

**Doctors:**
* transition from paper document flow to electronic
* access to data from other clinics
* prompt provision of information to emergency workers

**More information:** [presentation](https://docs.google.com/presentation/d/1TxEXXcMWpvSwv1GY_gKuPFU5ftwqNd2J7syRATtkBzk/edit?usp=sharing) about this project

## RoadMap

Our plans are available on [GitHub Projects](https://github.com/eshelukhina/HSE2021-SE/projects/1)

## Build and run
```
./gradlew build
./gradlew run
```

## Example of usage
```
Введите команду...
add doctor
Введите имя доктора
Ekaterina
Введите фамилию доктора
Shelukhina
Введите специализацию доктора
surgeon
Введите должность доктора
intern
Введите следующую команду...
get doctors
Введите имя доктора
Ekaterina
Введите фамилию доктора
Shelukhina
------------------------
doctor_id: 0
name: Ekaterina
surname:Shelukhina
specialization: surgeon
position:intern
------------------------
```

## Authors
* [Daniel Gabitov](https://github.com/DanielGabitov)
* [Pavel Egipti](https://github.com/egiptipavel)
* [Anastasia Chaikova](https://github.com/achaikova)
* [Ekaterina Shelukhina](https://github.com/eshelukhina)

## License

[MIT](https://choosealicense.com/licenses/mit/)
