@Test
    public void testEquals() {
        // default instances
        VectorRenderer r1 = new VectorRenderer();
        VectorRenderer r2 = new VectorRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        // check that super class fields are being looked at...
        r1.setSeriesFillPaint(0, Color.GREEN);
        assertFalse(r1.equals(r2));
        r2.setSeriesFillPaint(0, Color.GREEN);
        assertTrue(r1.equals(r2));
    }

    