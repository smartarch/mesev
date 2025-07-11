// Import necessary modules
import { grey, blue } from '@mui/material/colors';
import { createTheme, responsiveFontSizes } from '@mui/material/styles';

// Extend the existing palette interface to include custom properties
declare module '@mui/material/styles' {
  interface Palette {
    customGradient: {
      main: string
    }
    customGrey: {
      main: string
      dark: string
      light: string
      text: string
    }
    customBlue: {
      selected: string
    }
  }
  interface PaletteOptions {
    customGradient?: {
      main: string
    }
    customGrey?: {
      main: string
      dark: string
      light: string
      text: string
    }
    customBlue?: {
      selected: string
    }
  }
}

// Create the theme
let theme = createTheme({
  palette: {
    primary: {
      main: '#3766AF',
    },
    secondary: {
      main: '#6BBC8C',
    },
    customGradient: {
      main: 'linear-gradient(45deg, #6BBC8C 30%, #3766AF 90%)',
    },
    customGrey: {
      main: grey[100],
      dark: grey[400],
      light: grey[50],
      text: grey[700]
    },
    customBlue: {
      selected: blue[50]
    },
    background: {
      default: '#FFFFFF',
      paper: '#FFFFFF',
    },
    text: {
      primary: '#0E1021',
      secondary: '#0E1021',
    },
  },
  typography: {
    fontFamily: '"All Round Gothic Bold", Arial, sans-serif',
    allVariants: {
      color: '#0E1021',
    },
  },
});

theme = responsiveFontSizes(theme, { factor: 2 });

export default theme;
