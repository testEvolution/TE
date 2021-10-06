@Test
    public void testCloning2() throws CloneNotSupportedException {
        CategoryAxis a1 = new CategoryAxis("Test");
        a1.setTickLabelFont("C1", new Font("Dialog", Font.PLAIN, 15));
        a1.setTickLabelPaint("C1", new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        CategoryAxis a2 = (CategoryAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));

        // check that changing a tick label font in a1 doesn't change a2
        a1.setTickLabelFont("C1", null);
        assertFalse(a1.equals(a2));
        a2.setTickLabelFont("C1", null);
        assertTrue(a1.equals(a2));

        // check that changing a tick label paint in a1 doesn't change a2
        a1.setTickLabelPaint("C1", Color.YELLOW);
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint("C1", Color.YELLOW);
        assertTrue(a1.equals(a2));

        // check that changing a category label tooltip in a1 doesn't change a2
        a1.addCategoryLabelToolTip("C1", "XYZ");
        assertFalse(a1.equals(a2));
        a2.addCategoryLabelToolTip("C1", "XYZ");
        assertTrue(a1.equals(a2));
    }

    