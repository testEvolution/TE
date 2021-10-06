@Test
    public void testEquals() {
        Crosshair c1 = new Crosshair(1.0, Color.BLUE, new BasicStroke(1.0f));
        Crosshair c2 = new Crosshair(1.0, Color.BLUE, new BasicStroke(1.0f));
        assertTrue(c1.equals(c1));
        assertTrue(c2.equals(c1));

        c1.setVisible(false);
        assertFalse(c1.equals(c2));
        c2.setVisible(false);
        assertTrue(c1.equals(c2));

        c1.setValue(2.0);
        assertFalse(c1.equals(c2));
        c2.setValue(2.0);
        assertTrue(c1.equals(c2));

        c1.setPaint(Color.RED);
        assertFalse(c1.equals(c2));
        c2.setPaint(Color.RED);
        assertTrue(c1.equals(c2));

        c1.setStroke(new BasicStroke(1.1f));
        assertFalse(c1.equals(c2));
        c2.setStroke(new BasicStroke(1.1f));
        assertTrue(c1.equals(c2));

        c1.setLabelVisible(true);
        assertFalse(c1.equals(c2));
        c2.setLabelVisible(true);
        assertTrue(c1.equals(c2));

        c1.setLabelAnchor(RectangleAnchor.TOP_LEFT);
        assertFalse(c1.equals(c2));
        c2.setLabelAnchor(RectangleAnchor.TOP_LEFT);
        assertTrue(c1.equals(c2));

        c1.setLabelGenerator(new StandardCrosshairLabelGenerator("Value = {0}",
                NumberFormat.getNumberInstance()));
        assertFalse(c1.equals(c2));
        c2.setLabelGenerator(new StandardCrosshairLabelGenerator("Value = {0}",
                NumberFormat.getNumberInstance()));
        assertTrue(c1.equals(c2));

        c1.setLabelXOffset(11);
        assertFalse(c1.equals(c2));
        c2.setLabelXOffset(11);
        assertTrue(c1.equals(c2));

        c1.setLabelYOffset(22);
        assertFalse(c1.equals(c2));
        c2.setLabelYOffset(22);
        assertTrue(c1.equals(c2));

        c1.setLabelFont(new Font("Dialog", Font.PLAIN, 8));
        assertFalse(c1.equals(c2));
        c2.setLabelFont(new Font("Dialog", Font.PLAIN, 8));
        assertTrue(c1.equals(c2));

        c1.setLabelPaint(Color.RED);
        assertFalse(c1.equals(c2));
        c2.setLabelPaint(Color.RED);
        assertTrue(c1.equals(c2));

        c1.setLabelBackgroundPaint(Color.YELLOW);
        assertFalse(c1.equals(c2));
        c2.setLabelBackgroundPaint(Color.YELLOW);
        assertTrue(c1.equals(c2));

        c1.setLabelOutlineVisible(false);
        assertFalse(c1.equals(c2));
        c2.setLabelOutlineVisible(false);
        assertTrue(c1.equals(c2));

        c1.setLabelOutlineStroke(new BasicStroke(2.0f));
        assertFalse(c1.equals(c2));
        c2.setLabelOutlineStroke(new BasicStroke(2.0f));
        assertTrue(c1.equals(c2));

        c1.setLabelOutlinePaint(Color.darkGray);
        assertFalse(c1.equals(c2));
        c2.setLabelOutlinePaint(Color.darkGray);
        assertTrue(c1.equals(c2));

    }

    