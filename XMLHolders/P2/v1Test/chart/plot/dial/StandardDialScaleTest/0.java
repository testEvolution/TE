@Test
    public void testEquals() {
        StandardDialScale s1 = new StandardDialScale();
        StandardDialScale s2 = new StandardDialScale();
        assertTrue(s1.equals(s2));

        // lowerBound
        s1 = new StandardDialScale(10.0, 100.0, 0.0, 270.0, 10.0, 4);
        assertFalse(s1.equals(s2));
        s2 = new StandardDialScale(10.0, 100.0, 0.0, 270.0, 10.0, 4);
        assertTrue(s1.equals(s2));

        // upperBound
        s1 = new StandardDialScale(10.0, 200.0, 0.0, 270.0, 10.0, 4);
        assertFalse(s1.equals(s2));
        s2 = new StandardDialScale(10.0, 200.0, 0.0, 270.0, 10.0, 4);
        assertTrue(s1.equals(s2));

        // startAngle
        s1 = new StandardDialScale(10.0, 200.0, 20.0, 270.0, 10.0, 4);
        assertFalse(s1.equals(s2));
        s2 = new StandardDialScale(10.0, 200.0, 20.0, 270.0, 10.0, 4);
        assertTrue(s1.equals(s2));

        // extent
        s1 = new StandardDialScale(10.0, 200.0, 20.0, 99.0, 10.0, 4);
        assertFalse(s1.equals(s2));
        s2 = new StandardDialScale(10.0, 200.0, 20.0, 99.0, 10.0, 4);
        assertTrue(s1.equals(s2));

        // tickRadius
        s1.setTickRadius(0.99);
        assertFalse(s1.equals(s2));
        s2.setTickRadius(0.99);
        assertTrue(s1.equals(s2));

        // majorTickIncrement
        s1.setMajorTickIncrement(11.1);
        assertFalse(s1.equals(s2));
        s2.setMajorTickIncrement(11.1);
        assertTrue(s1.equals(s2));

        // majorTickLength
        s1.setMajorTickLength(0.09);
        assertFalse(s1.equals(s2));
        s2.setMajorTickLength(0.09);
        assertTrue(s1.equals(s2));

        // majorTickPaint
        s1.setMajorTickPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(s1.equals(s2));
        s2.setMajorTickPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(s1.equals(s2));

        // majorTickStroke
        s1.setMajorTickStroke(new BasicStroke(1.1f));
        assertFalse(s1.equals(s2));
        s2.setMajorTickStroke(new BasicStroke(1.1f));
        assertTrue(s1.equals(s2));

        // minorTickCount
        s1.setMinorTickCount(7);
        assertFalse(s1.equals(s2));
        s2.setMinorTickCount(7);
        assertTrue(s1.equals(s2));

        // minorTickLength
        s1.setMinorTickLength(0.09);
        assertFalse(s1.equals(s2));
        s2.setMinorTickLength(0.09);
        assertTrue(s1.equals(s2));

        // tickLabelOffset
        s1.setTickLabelOffset(0.11);
        assertFalse(s1.equals(s2));
        s2.setTickLabelOffset(0.11);
        assertTrue(s1.equals(s2));

        // tickLabelFont
        s1.setTickLabelFont(new Font("Dialog", Font.PLAIN, 15));
        assertFalse(s1.equals(s2));
        s2.setTickLabelFont(new Font("Dialog", Font.PLAIN, 15));
        assertTrue(s1.equals(s2));

        // tickLabelPaint
        s1.setTickLabelPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.GREEN));
        assertFalse(s1.equals(s2));
        s2.setTickLabelPaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.GREEN));
        assertTrue(s1.equals(s2));

        s1.setTickLabelsVisible(false);
        assertFalse(s1.equals(s2));
        s2.setTickLabelsVisible(false);
        assertTrue(s1.equals(s2));

        // check an inherited attribute
        s1.setVisible(false);
        assertFalse(s1.equals(s2));
        s2.setVisible(false);
        assertTrue(s1.equals(s2));
    }

    