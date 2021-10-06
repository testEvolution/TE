@Test
    public void testEquals() {
        TextTitle t1 = new TextTitle();
        TextTitle t2 = new TextTitle();
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

        t1.setTextAlignment(HorizontalAlignment.RIGHT);
        assertFalse(t1.equals(t2));
        t2.setTextAlignment(HorizontalAlignment.RIGHT);
        assertTrue(t1.equals(t2));

        // paint
        t1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        assertTrue(t1.equals(t2));

        // backgroundPaint
        t1.setBackgroundPaint(new GradientPaint(4.0f, 3.0f, Color.RED,
                2.0f, 1.0f, Color.BLUE));
        assertFalse(t1.equals(t2));
        t2.setBackgroundPaint(new GradientPaint(4.0f, 3.0f, Color.RED,
                2.0f, 1.0f, Color.BLUE));
        assertTrue(t1.equals(t2));

        // maximumLinesToDisplay
        t1.setMaximumLinesToDisplay(3);
        assertFalse(t1.equals(t2));
        t2.setMaximumLinesToDisplay(3);
        assertTrue(t1.equals(t2));

        // toolTipText
        t1.setToolTipText("TTT");
        assertFalse(t1.equals(t2));
        t2.setToolTipText("TTT");
        assertTrue(t1.equals(t2));

        // urlText
        t1.setURLText(("URL"));
        assertFalse(t1.equals(t2));
        t2.setURLText(("URL"));
        assertTrue(t1.equals(t2));

        // expandToFitSpace
        t1.setExpandToFitSpace(!t1.getExpandToFitSpace());
        assertFalse(t1.equals(t2));
        t2.setExpandToFitSpace(!t2.getExpandToFitSpace());
        assertTrue(t1.equals(t2));

    }

    