@Test
    public void testCalculateQ3() {
        // try null argument
        boolean pass = false;
        try {
            BoxAndWhiskerCalculator.calculateQ3(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        List<Double> values = new ArrayList<>();
        double q3 = BoxAndWhiskerCalculator.calculateQ3(values);
        assertTrue(Double.isNaN(q3));
        values.add(1.0);
        q3 = BoxAndWhiskerCalculator.calculateQ3(values);
        assertEquals(q3, 1.0, EPSILON);
        values.add(2.0);
        q3 = BoxAndWhiskerCalculator.calculateQ3(values);
        assertEquals(q3, 2.0, EPSILON);
        values.add(3.0);
        q3 = BoxAndWhiskerCalculator.calculateQ3(values);
        assertEquals(q3, 2.5, EPSILON);
        values.add(4.0);
        q3 = BoxAndWhiskerCalculator.calculateQ3(values);
        assertEquals(q3, 3.5, EPSILON);
    }

    