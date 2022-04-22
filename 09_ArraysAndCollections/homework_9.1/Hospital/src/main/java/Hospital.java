import java.text.DecimalFormat;

public class Hospital {
    public final static float MIN_TEMP = 32;
    public final static float MAX_TEMP = 40;
    public final static int PATIENTS = 30;
    public final static float MIN_HEALTHY = 36.2F;
    public final static float MAX_HEALTHY = 36.9F;
    public static float[] generatePatientsTemperatures(int patientsCount) {


        //TODO: напишите метод генерации массива температур пациентов

        float temperatures[] = new float[patientsCount];
        for (int i = 0; i <= patientsCount - 1; i++) {

            temperatures[i] = (Math.round(10*(MIN_TEMP + (float) (Math.random() * (MAX_TEMP-MIN_TEMP))))/(float)10);


        }

        return temperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        int i = 0;
        int counterHealthy = 0;
        float amount = 0;
        String temperatures = "";
        for (i = 0; i < temperatureData.length; i++) {
            temperatures = temperatures + " " + temperatureData[i];
            amount = amount + temperatureData[i];
            if ((temperatureData[i] >= MIN_HEALTHY) && (temperatureData[i] <= MAX_HEALTHY)) {
                counterHealthy++;
            }
        }

        String report =
                "Температуры пациентов:" + temperatures +
                        "\nСредняя температура: " + (Math.round((amount / temperatureData.length) * (float) 100)) / (float) 100 +
                        "\nКоличество здоровых: " + counterHealthy;


        return report;
    }
}
