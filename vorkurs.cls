\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{vorkurs}[2012/06/08 MathPhys Info-vorkurs]

\DeclareOption*{\PassOptionsToClass{\CurrentOption}{scrbook}}
\ProcessOptions\relax
\LoadClass[a4paper,oneside]{scrbook}

\RequirePackage{fancyhdr}
\RequirePackage[explicit,clearempty]{titlesec}
\RequirePackage{titletoc}
\RequirePackage{amsmath}
\RequirePackage[ngerman]{babel}
\RequirePackage{microtype}
\RequirePackage{minted}

\setlength{\parskip}{0.5em}
\setlength{\parindent}{0pt}
\addtolength{\headheight}{\baselineskip}
\renewcommand{\sectionmark}[1]{\markright{#1}}
\renewcommand{\chaptermark}[1]{\renewcommand{\leftmark}{#1}}
\lhead{\textsc{Kapitel \thechapter \\ \leftmark}}
\chead{\small{Programmiervorkurs der Fachschaft MathPhys} \\ \vspace{0.5em}\textbf{\large Lektion \theFakeSection: \rightmark}}
\rhead{\small Seite \thepage}
\lfoot{}
\cfoot{}
\rfoot{}

\titleformat{\section}[display]{\markright{#1}}{}{0pt}{}
\newcounter{FakeSection}
\newcommand{\sectionbreak}{\clearpage\stepcounter{FakeSection}\setcounter{section}{\value{FakeSection}}}
\newcommand{\lesson}[1]{\section*{#1}\pagestyle{fancy}\addcontentsline{toc}{section}{#1}}
\renewcommand*\thesection{\arabic{section}}

\titlecontents{chapter}[0pt]{\vspace{1em}\large\bf}{\makebox[60pt][l]{Kapitel \thecontentslabel:}\hspace*{10pt}}{}{\titlerule*[1pc]{ }\contentspage}
\titlecontents{section}[10pt]{}{\makebox[50pt][l]{Lektion \thecontentslabel:}\hspace*{10pt}}{}{\titlerule*[1pc]{ }\contentspage}

\newcommand{\inputcpp}[1]{\usemintedstyle{vs}\inputminted[label=#1,linenos=true,frame=single]{c++}{files/#1}}
\newcommand{\inputshell}[1]{\usemintedstyle{vs}\inputminted[label=#1,linenos=true,frame=single]{bash}{files/#1}}
\newcommand{\cppsect}[3]{\usemintedstyle{vs}\inputminted[label=#1,linenos=true,frame=single,firstline=#2,lastline=#3,firstnumber=#2]{c++}{files/#1}}

\newminted{text}{frame=single}
