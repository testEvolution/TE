@Test
    public void testEquals() {
        DateTitle t1 = new DateTitle();
        DateTitle t2 = new DateTitle();
        assertEquals(t1, t2);

        t1.setText("Test 1");
        assertFalse(t1.equals(t2));
        t2.setText("Test 1");
        assertTrue(t1.equals(t2));

        Font f = new Font("SansSerif", Font.PLAIN, 15);
        t1.setFont(f);
        assertFalse(t1.equals(t2));
        t2.setFont(f);
        assertTrue(t1.equals(t2));

        t1.setPaint(Color.BLUE);
        assertFalse(t1.equals(t2));
        t2.setPaint(Color.BLUE);
        assertTrue(t1.equals(t2));

        t1.setBackgroundPaint(Color.BLUE);
        assertFalse(t1.equals(t2));
        t2.setBackgroundPaint(Color.BLUE);
        assertTrue(t1.equals(t2));

    }

    