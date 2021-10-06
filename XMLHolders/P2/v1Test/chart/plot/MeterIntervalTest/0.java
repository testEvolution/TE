@Test
    public void testEquals() {

        MeterInterval m1 = new MeterInterval(
            "Label 1", new Range(1.2, 3.4), Color.RED, new BasicStroke(1.0f),
            Color.BLUE
        );
        MeterInterval m2 = new MeterInterval(
            "Label 1", new Range(1.2, 3.4), Color.RED, new BasicStroke(1.0f),
            Color.BLUE
        );
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));

        m1 = new MeterInterval(
            "Label 2", new Range(1.2, 3.4), Color.RED, new BasicStroke(1.0f),
            Color.BLUE
        );
        assertFalse(m1.equals(m2));
        m2 = new MeterInterval(
            "Label 2", new Range(1.2, 3.4), Color.RED, new BasicStroke(1.0f),
            Color.BLUE
        );
        assertTrue(m1.equals(m2));

    }

    