@Test
    public void testEquals() {
        BoxAndWhiskerRenderer r1 = new BoxAndWhiskerRenderer();
        BoxAndWhiskerRenderer r2 = new BoxAndWhiskerRenderer();
        assertEquals(r1, r2);

        r1.setArtifactPaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(r1.equals(r2));
        r2.setArtifactPaint(new GradientPaint(1.0f, 2.0f, Color.YELLOW,
                3.0f, 4.0f, Color.BLUE));
        assertEquals(r1, r2);

        r1.setFillBox(!r1.getFillBox());
        assertFalse(r1.equals(r2));
        r2.setFillBox(!r2.getFillBox());
        assertEquals(r1, r2);

        r1.setItemMargin(0.11);
        assertFalse(r1.equals(r2));
        r2.setItemMargin(0.11);
        assertEquals(r1, r2);

        r1.setMaximumBarWidth(0.99);
        assertFalse(r1.equals(r2));
        r2.setMaximumBarWidth(0.99);
        assertTrue(r1.equals(r2));

        r1.setMeanVisible(false);
        assertFalse(r1.equals(r2));
        r2.setMeanVisible(false);
        assertTrue(r1.equals(r2));

        r1.setMedianVisible(false);
        assertFalse(r1.equals(r2));
        r2.setMedianVisible(false);
        assertTrue(r1.equals(r2));

        r1.setMinOutlierVisible(false);
        assertFalse(r1.equals(r2));
        r2.setMinOutlierVisible(false);
        assertTrue(r1.equals(r2));

        r1.setMaxOutlierVisible(false);
        assertFalse(r1.equals(r2));
        r2.setMaxOutlierVisible(false);
        assertTrue(r1.equals(r2));
    }

    