@Test
    public void testCalculateQ1() {

        // try null argument
        boolean pass = false;
        try {
            BoxAndWhiskerCalculator.calculateQ1(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        List<Double> values = new ArrayList<>();
        double q1 = BoxAndWhiskerCalculator.calculateQ1(values);
        assertTrue(Double.isNaN(q1));
        values.add(1.0);
        q1 = BoxAndWhiskerCalculator.calculateQ1(values);
        assertEquals(q1, 1.0, EPSILON);
        values.add(2.0);
        q1 = BoxAndWhiskerCalculator.calculateQ1(values);
        assertEquals(q1, 1.0, EPSILON);
        values.add(3.0);
        q1 = BoxAndWhiskerCalculator.calculateQ1(values);
        assertEquals(q1, 1.5, EPSILON);
        values.add(4.0);
        q1 = BoxAndWhiskerCalculator.calculateQ1(values);
        assertEquals(q1, 1.5, EPSILON);
    }

    